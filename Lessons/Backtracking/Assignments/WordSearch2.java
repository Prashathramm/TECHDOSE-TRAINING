package Lessons.Backtracking.Assignments;
import java.util.*;
public class WordSearch2 {
    Set<String>set=new HashSet<>();
    boolean[][] vis;
    int[][] dir=new int[][]{{-1,0},{0,-1},{0,1},{1,0}};
    public List<String> findWords(char[][] board, String[] words) {
        Trie_node main=new Trie_node();
        for(String s:words) {
            insert(s,main);
        }
        int r=board.length,c=board[0].length;
        for(int i=0;i<r;++i) {
            for(int j=0;j<c;++j) {
                traverse(board,i,j,r,c,main);
            }
        }
        return new ArrayList<>(set);
    }
    public void insert(String s,Trie_node main) {
        Trie_node temp=main;
        for(char ch:s.toCharArray()) {
            if(temp.arr[ch-'a']==null) {
                temp.arr[ch-'a']=new Trie_node();
            }
            temp=temp.arr[ch-'a'];
        }
        temp.flag=true;
        temp.word=s;
    }
    public void traverse(char[][] board,int i,int j,int r,int c,Trie_node temp) {
        char ch=board[i][j];
        if(ch==';' || temp.arr[ch-'a']==null) {
            return;
        }
        temp=temp.arr[ch-'a'];
        if(temp.word!=null) {
            set.add(temp.word);
            temp.word=null;
        }
        board[i][j]=';';
        for(int p=0;p<4;++p) {
            int x=dir[p][0]+i;
            int y=dir[p][1]+j;
            if(x>-1 && x<r && y>-1 && y<c) {
                traverse(board,x,y,r,c,temp);
            }
        }
        board[i][j]=ch;
    }
}
class Trie_node {
    Trie_node arr[];
    boolean flag;
    String word;
    Trie_node() {
        arr=new Trie_node[26];
        flag=false;
        word=null;
    }
}
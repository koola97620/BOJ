package WooHyunJae;
import java.awt.*;  
import javax.swing.event.*;  
import javax.swing.*;  
  
class DataItem {  
   private int weight;  
   private char letter;  
   public String stringCode; 
  
   public DataItem( char c )  
   {  
      letter = c;  
      weight = 0;  
   }  
  
   public DataItem( int n )  
   {  
      weight = n;  
      letter = '\0';  
   }  
  
   public void increaseWeight()  
   { ++weight; }  
  
   public char getLetter() 
   { return letter; }  
  
   public int getWeight()  
   { return weight; }  
}///: class DataItem  
  

  
class WeightCount {  
   private String str;  
   private int n =0; 
   private DataItem[] letterNode;  
   public DataItem[] dataItems;  
  
   public WeightCount( String s )  
   {  
      str = s;  
      str = str.trim().toLowerCase();  
      letterNode = new DataItem[ 26 ];  
      countWeight();  
   }  
  
   private void countWeight()  
   {  char letter;  
      try {  
         for ( int i = 0; i < str.length(); i++ ) {  
            letter = str.charAt( i );  
            if ( letter == ' ' ) continue;  
            switch ( letter ) {  
               case 'a':  
                  if ( letterNode[ 0 ] == null ) {  
                     n++;  
                     letterNode[ 0 ] = new DataItem( 'a' );  
                     letterNode[ 0 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 0 ].increaseWeight();  
               break;  
  
               case 'b':  
                  if ( letterNode[ 1 ] == null ) {  
                     n++;  
                     letterNode[ 1 ] = new DataItem( 'b' );  
                     letterNode[ 1 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 1 ].increaseWeight();  
               break;  
  
               case 'c':  
                  if ( letterNode[ 2 ] == null ) {  
                     n++;  
                     letterNode[ 2 ] = new DataItem( 'c' );  
                     letterNode[ 2 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 2 ].increaseWeight();  
               break;  
  
               case 'd':  
                  if ( letterNode[ 3 ] == null ) {  
                     n++;  
                     letterNode[ 3 ] = new DataItem( 'd' );  
                     letterNode[ 3 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 3 ].increaseWeight();  
               break;  
  
               case 'e':  
                  if ( letterNode[ 4 ] == null ) {  
                     n++;  
                     letterNode[ 4 ] = new DataItem( 'e' );  
                     letterNode[ 4 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 4 ].increaseWeight();  
               break;  
  
               case 'f':  
                  if ( letterNode[ 5 ] == null ) {  
                     n++;  
                     letterNode[ 5 ] = new DataItem( 'f' );  
                     letterNode[ 5 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 5 ].increaseWeight();  
               break;  
  
               case 'g':  
                  if ( letterNode[ 6 ] == null ) {  
                     n++;  
                     letterNode[ 6 ] = new DataItem( 'g' );  
                     letterNode[ 6 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 6 ].increaseWeight();  
               break;  
  
               case 'h':  
                  if ( letterNode[ 7 ] == null ) {  
                     n++;  
                     letterNode[ 7 ] = new DataItem( 'h' );  
                     letterNode[ 7 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 7 ].increaseWeight();  
               break;  
  
               case 'i':  
                  if ( letterNode[ 8 ] == null ) {  
                     n++;  
                     letterNode[ 8 ] = new DataItem( 'i' );  
                     letterNode[ 8 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 8 ].increaseWeight();  
               break;  
  
               case 'j':  
                  if ( letterNode[ 9 ] == null ) {  
                     n++;  
                     letterNode[ 9 ] = new DataItem( 'j' );  
                     letterNode[ 9 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 9 ].increaseWeight();  
               break;  
               case 'k':  
                  if ( letterNode[ 10 ] == null ) {  
                     n++;  
                     letterNode[ 10 ] = new DataItem( 'k' );  
                     letterNode[ 10 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 10 ].increaseWeight();  
               break;  
  
               case 'l':  
                  if ( letterNode[ 11 ] == null ) {  
                     n++;  
                     letterNode[ 11 ] = new DataItem( 'l' );  
                     letterNode[ 11 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 11 ].increaseWeight();  
               break;  
  
               case 'm':  
                  if ( letterNode[ 12 ] == null ) {  
                     n++;  
                     letterNode[ 12 ] = new DataItem( 'm' );  
                     letterNode[ 12 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 12 ].increaseWeight();  
               break;  
  
               case 'n':  
                  if ( letterNode[ 13 ] == null ) {  
                     n++;  
                     letterNode[ 13 ] = new DataItem( 'n' );  
                     letterNode[ 13 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 13 ].increaseWeight();  
               break;  
  
               case 'o':  
                  if ( letterNode[ 14 ] == null ) {  
                     n++;  
                     letterNode[ 14 ] = new DataItem( 'o' );  
                     letterNode[ 14 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 14 ].increaseWeight();  
               break;  
  
               case 'p':  
                  if ( letterNode[ 15 ] == null ) {  
                     n++;  
                     letterNode[ 15 ] = new DataItem( 'p' );  
                     letterNode[ 15 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 15 ].increaseWeight();  
               break;  
  
               case 'q':  
                  if ( letterNode[ 16 ] == null ) {  
                     n++;  
                     letterNode[ 16 ] = new DataItem( 'q' );  
                     letterNode[ 16 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 16 ].increaseWeight();  
               break;  
  
               case 'r':  
                  if ( letterNode[ 17 ] == null ) {  
                     n++;  
                     letterNode[ 17 ] = new DataItem( 'r' );  
                     letterNode[ 17 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 17 ].increaseWeight();  
               break;  
  
               case 's':  
                  if ( letterNode[ 18 ] == null ) {  
                     n++;  
                     letterNode[ 18 ] = new DataItem( 's' );  
                     letterNode[ 18 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 18 ].increaseWeight();  
               break;  
  
               case 't':  
                  if ( letterNode[ 19 ] == null ) {  
                     n++;  
                     letterNode[ 19 ] = new DataItem( 't' );  
                     letterNode[ 19 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 19 ].increaseWeight();  
               break;  
  
               case 'u':  
                  if ( letterNode[ 20 ] == null ) {  
                     n++;  
                     letterNode[ 20 ] = new DataItem( 'u' );  
                     letterNode[ 20 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 20 ].increaseWeight();  
               break;  
  
               case 'v':  
                  if ( letterNode[ 21 ] == null ) {  
                     n++;  
                     letterNode[ 21 ] = new DataItem( 'v' );  
                     letterNode[ 21 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 21 ].increaseWeight();  
               break;  
  
               case 'w':  
                  if ( letterNode[ 22 ] == null ) {  
                     n++;  
                     letterNode[ 22 ] = new DataItem( 'w' );  
                     letterNode[ 22 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 22 ].increaseWeight();  
               break;  
  
               case 'x':  
                  if ( letterNode[ 23 ] == null ) {  
                     n++;  
                     letterNode[ 23 ] = new DataItem( 'x' );  
                     letterNode[ 23 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 23 ].increaseWeight();  
               break;  
  
               case 'y':  
                  if ( letterNode[ 24 ] == null ) {  
                     n++;  
                     letterNode[ 24 ] = new DataItem( 'y' );  
                     letterNode[ 24 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 24 ].increaseWeight();  
               break;  
  
               case 'z':  
                  if ( letterNode[ 25 ] == null ) {  
                     n++;  
                     letterNode[ 25 ] = new DataItem( 'z' );  
                     letterNode[ 25 ].increaseWeight();  
                  }  
                  else  
                     letterNode[ 25 ].increaseWeight();  
               break;  
  
               default:  
                  throw new NoValidLetterException();  
            }  
         }  
      }  
      catch ( NoValidLetterException e ) {  
         System.out.println( "NoValidLetterException!!!!" );
      }  
      dataItems = new DataItem[ n ];  
      for ( int m = 0, j = 0; j < letterNode.length; j++ ) {  
         if ( letterNode[ j ] == null ) continue;  
         dataItems[ m++ ] = letterNode[ j ];  
      }  
   }  
}///: class WeightCount  
  
class TreeNode {  
   TreeNode parent;  
   TreeNode left;  
   TreeNode right;  
   DataItem data;  
  
   public TreeNode( DataItem di, TreeNode l, TreeNode r )  
   {  
      data = di;  
      left = l;  
      right = r;  
      parent = null;  
   }  
   public TreeNode( DataItem di )  
   {  
      data = di;  
      left = right = parent = null;  
   }  
}///: class TreeNode  
  
class Tree {  
   private int n;    
   private TreeNode[] node;  
   private TreeNode first, second;  
   public TreeNode[] nodeObject;  
   public TreeNode root;  
   public WeightCount w;  
  
   public Tree( String s )  
   {  
      w = new WeightCount( s );  
      n = w.dataItems.length;  
      node = new TreeNode[ 2*n-1 ];  
      nodeObject = new TreeNode[ n ];  
      for ( int j = 0; j < n; j++ ) {  
      node[ j ] = nodeObject[ j ] = new TreeNode( w.dataItems[ j ] );  
      }  
      root = createTree();  
   }  
  
   private TreeNode createTree()  
   {  
      for ( int k = 0; k < n-1; k++ ) {  
         TreeNode minNode;  
         int i = 0;  
         label:                       
         for (; i < node.length - 1; i++ ) {  
            if ( node[ i ] ==null ) continue;  
            minNode = node[ i ];  
            for ( int s = i+1; s < node.length; s++ ){  
               if ( node[ s ] ==null ) continue;  
     
               if ( ( node[ s ].data.getWeight() < minNode.data.getWeight() ) && ( i == node.length - 2 ) ) {  
                  minNode = node[ s ];  
                  break;  
               }  
               if ( node[ s ].data.getWeight() < minNode.data.getWeight() ) continue label;  
            }  
            
            first = minNode;  
            if ( minNode == node[ i ] ) node[ i ] = null;  
            else node[ i + 1 ] = null;  
            break;  
         }  
         int j = 0;  
         read:                    //ҳСȨֵĽڵ  
         for ( ; j < node.length - 1; j++ ) {  
            if ( node[ j ] ==null ) continue;  
            minNode = node[ j ];  
            for ( int s = j+1; s < node.length; s++ ){  
               if ( node[ s ] ==null ) continue;  
               if ( ( node[ s ].data.getWeight() < minNode.data.getWeight() ) && ( j == node.length - 2 ) ) {  
                  minNode = node[ s ];  
                  break;  
               }  
               if ( node[ s ].data.getWeight() < minNode.data.getWeight() ) continue read;  
            }  
            second = minNode;  
            if ( minNode == node[ j ] ) node[ j ] = null;  
            else node[ j + 1 ] = null;  
            break;  
         }  
         node[ n + k ] = new TreeNode( new DataItem( first.data.getWeight() + second.data.getWeight() ), first, second );  
         first.parent = second.parent = node[ n + k ];  
      }  
      return node[ 2 * n - 2 ];  
   }  
  
   public int getNodeNumber()  
   { return n; }  
  
}///: class Tree  

class Code {  
   private StringBuffer strBuffer;  
   private int n;  
   private Tree tree;  
   public Code( Tree t )  
   {  
      tree = t;  
      n = t.getNodeNumber();  
      coding();  
   }  
  
   private void traversal( int z )  
   {  
      int i = z;  
      strBuffer = new StringBuffer();  
      TreeNode parentNode, currentNode = tree.nodeObject[ i ];  
      
      while ( currentNode.parent != null ) {  
         parentNode = currentNode.parent;  
         if ( parentNode.left == currentNode ) strBuffer.append( '0' );  
         if ( parentNode.right == currentNode ) strBuffer.append( '1' );  
         currentNode = currentNode.parent;  
      }  
      tree.w.dataItems[ i ].stringCode = new String( strBuffer );  
   }  
   public void coding()  
   {  
      for ( int y = 0; y < n; y++ )  
         traversal( y );  
   }  
}

  
class Encode {  
   private TreeNode cur;  
   private String str;  
   public StringBuffer strEncodeBuffer;  
  
   public Encode( String s ,Tree t)  
   {  
      strEncodeBuffer = new StringBuffer();  
      StringBuffer strB = new StringBuffer( s );
      str = new String( strB.reverse() );  
      cur = t.root;  
  
   }  
  
   public void encoding() throws NoValidBinaryCodeException, Exception
   {  
      char c;  
      TreeNode current = cur;  
      int n = 0;  
      for ( ; n < str.length(); n++ ) {  
         c = str.charAt( n );  
         if ( c == ' ' ) continue;  
         else  
            if ( c != '0' && c != '1' ) {  
               throw new NoValidBinaryCodeException();  
            }  
         if ( c == '0' ) current = current.left;  
         if ( c == '1' ) current = current.right;  
         //ҶgetLetter()strEncodeBuffer  
         if (  current.right == null && current.left == null  ) {  
            strEncodeBuffer.append( current.data.getLetter() );  
            current = cur;  
         }  
         if ( (  n != str.length() - 1) && current.left == null && current.right == null )  
            throw new Exception();  
      }  
      if ( ( n == str.length() - 1 ) && current.left != null && current.right != null ) {  
         throw new Exception();  
      }  
      return;  
   }  
  
   public String getEncodeString()  
   {  
      return strEncodeBuffer.reverse().toString();  
   }  
}///: class Encode  
  
class NoValidBinaryCodeException extends Exception {  
   public NoValidBinaryCodeException()  
   { super(); }  
   public NoValidBinaryCodeException( String s )  
   { super( s ); }  
}///: class NoValidBinaryCodeException  
  
class NoValidLetterException extends Exception {  
   public NoValidLetterException()  
   { super(); }  
   public NoValidLetterException( String s )  
   { super( s ); }  
}///: class NoValidLetterException  
  
  
 class Huffman {  
   public static void main( String[] args )  
   
   {  
  
       boolean isGoon = false;  
      do {  
         String s = JOptionPane.showInputDialog( "입력하세요ַ" );  
         Tree tree = new Tree( s );  
         Code c = new Code( tree );  
         for ( int a =0; a < tree.nodeObject.length; a++ ) {  
            System.out.println( "   " + tree.nodeObject[ a ].data.getLetter() + "------" + tree.nodeObject[ a ].data.stringCode );
            System.out.println("");
         }
        
         char ch[] = s.toCharArray();
         StringBuffer charBuffer = new StringBuffer();
         
         for(int a=0; a < s.length() ; a++) {
        	 for(int b = 0 ; b < tree.nodeObject.length ; b++) {
        		 if(ch[a] == tree.nodeObject[b].data.getLetter()) {
        			 charBuffer = charBuffer.append(tree.nodeObject[b].data.stringCode);
        		 }
        	 }
         }
         
         System.out.println(s + "  =  " + charBuffer);
  
         int result = JOptionPane.showConfirmDialog( (Component)null, "다시하시겠습니까?", "Choose", JOptionPane.YES_NO_OPTION );  
         if ( result == JOptionPane.YES_OPTION ) {  
            String t = JOptionPane.showInputDialog( "입력" );  
            Encode en = new Encode( t , tree );  
            try {  
               en.encoding();  
               System.out.println( en.getEncodeString() );  
            }  
            catch ( NoValidBinaryCodeException e ) {  
               System.out.println( "NoValidBinaryCodeException " );  
            }  
            catch ( Exception e ) {  
               System.out.println ( "error" );  
            }  
         }  
         else { System.exit( 0 ); }  
  
         int con = JOptionPane.showConfirmDialog( (Component)null, "입력하세요", "Choose", JOptionPane.YES_NO_OPTION );  
         if ( con == JOptionPane.YES_OPTION ) isGoon = true;  
      }while( isGoon == true );  
      System.exit( 0 );  
   }  
   }  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laprak9;

/**
 *
 * @author MNafis
 */
    class Node{          
        int data;        
        Node nodeKiri;        
        Node nodeKanan;                
        public Node(int dt){          
            data = dt;          
            nodeKiri = nodeKanan = null;        
        }               
        public void sisipDt(int dtSisip ){                   
            if (dtSisip < data){                         
                if(nodeKiri == null)                
                    nodeKiri = new Node( dtSisip );             
                else nodeKiri.sisipDt( dtSisip );          
            }           
            else if(dtSisip > data){                        
                if ( nodeKanan == null )                
                    nodeKanan = new Node(dtSisip);             
                else nodeKanan.sisipDt(dtSisip);          
            }       
        }    
    }      
    public class Laprak9{       
        private Node root;         
        public Laprak9() {          
            root = null;       
        }                
        public void sisipDtNode(int dtSisip){        
            if (root == null)             
                root = new Node( dtSisip );          
            else             
                root.sisipDt(dtSisip);        
        }                
        public void preorderTraversal() {          
            preorder(root);                
        }          
        private void preorder(Node node){          
            if(node == null) return;            
            System.out.printf( "%d ", node.data );           
            preorder(node.nodeKiri);                  
            preorder(node.nodeKanan);             
    }          
    public void inorderTraversal(){          
        inorder( root );
    }                
}  

package com.collectionframework;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

import sun.text.IntHashtable;

public class CollectionArray {

	public static void main(String[] args) {
              //one dimensional Arrays in java // just a list of variable //Declare the array
			int[] apple= new int[3]; 
		                          //initialize the array and set it's size
				apple[0]=75;       //store value into array
				apple[1]=34;
				apple[2]=56;
				
				for(int abc:apple){
				     System.out.println("The value of apple is; "+abc);
					}
		

		//------------------------------------------		
//			String[] you= new String[3];
//				you[0]="Love yourself";
//				you[1]="alive is awesome";
//				you[2]="Be in present";
//				
//				
//				for (int i= 0;i<you.length;i++) {
//					System.out.println(you[i]);
//				}
		//---------------------------------------------
		//=== Arraylist is not same  as array, u can put as many values		
		//ArrayList<String>arraylistobj=new ArrayList<String>();
		//	
		//arraylistobj.add("alive is awesome");
		//arraylistobj.add("Love yourself");	
		//arraylistobj.add("I love Java");	
		//	
		//for (int i= 0;i<arraylistobj.size();i++) 
//			System.out.println("ArrayList Example "+arraylistobj.get(i));
		//}
		//---------------------------------------------------------
		//=====2D Array=====
		//HashMap<String,String> map = new HashMap<String,String>();
//		    map.put("Tom","4564579807");  // in the bank use name ,number
//		    map.put("Sam","870982365");
//		    map.put("Molly","675098567");
		//
		//System.out.println(map);
		//System.out.println("This is Molly's number "+map.get("Molly"));
//			}
		//---------------------------------------
//				HashMap<String,Integer> map=new HashMap<String,Integer>();
//				map.put("Tom",4564579);
//			    map.put("Sam",8709823);
//				map.put("Molly",6750985);
//				
//				System.out.println(map);
//				System.out.println("This is Sam's number "+map.get("Sam"));
//				}
		//----------------------------------------------------	
//			Hashtable<String,Integer> map=new Hashtable<String,Integer>();
//			
//			map.put("Tom",456457980);
//			map.put("Sam",870982365);
//			map.put("Molly",675098567);
//			System.out.println(map);  // can not put index as=(map 2);
//			System.out.println("This is Molly's number "+map.get("Molly"));
//				}
		//--------------------------------------------
		//==== 2 dimentional array		
//				int[][] orange = new int[3][4];
//				orange [2][1] = 45;
//				orange [0][1] = 67;
//				orange [1][1] = 78;
//			    orange [1][2] = 90;
//				orange [0][2] = 23;//excell sheet
		//	
//			System.out.println(orange[1][2]); // run = 90
//			}
		//============excel sheet=======
//		      A[0]     B[1]     C[2]      
		//1  Column1 Column2 Column3	Column4	
		//2    [0]      67	     23		
		//3    [1]      78       90		
		//4    [2]      45			
		//5			
					
			
	}

}

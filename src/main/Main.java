package main;

import imageCmp.ImageCmp;

public class Main {
	static String arr[]={"6890746497_34bc10a556_z (2).jpg",
			"6890746705_cacc135d45_z (2).jpg",
			"6890746653_c037528075_z.jpg",
			"6890746705_cacc135d45_z.jpg",
			"6890746679_f82c305b8c_z (2).jpg",
			"6890746753_46ec698990_z (2).jpg",
			"6890746679_f82c305b8c_z.jpg",
			"6890746753_46ec698990_z.jpg"};
	public static void main(String argv[]) throws Exception{
		String path="F:\\Photos\\leaks\\test\\";
		int size=arr.length;
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				ImageCmp ic=new ImageCmp(path+arr[i],path+arr[j]);
				System.out.println(ic.GetCmp());
			}
		}
	}
}

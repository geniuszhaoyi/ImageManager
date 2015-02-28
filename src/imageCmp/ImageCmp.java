package imageCmp;

import java.awt.image.*;
import java.io.*;

import javax.imageio.*;

public class ImageCmp {
	public BufferedImage ba,bb;
	public ImageCmp(){
		ba=null;
		bb=null;
	}
	public ImageCmp(String a,String b) throws IOException{
		this();
		ba = ImageIO.read(new File(a));
		bb = ImageIO.read(new File(b));
	}
	public void addImageA(String a) throws IOException{
		ba = ImageIO.read(new File(a));
	}
	public void addImageB(String b) throws IOException{
		bb = ImageIO.read(new File(b));
	}
	public void checkExist() throws Exception{
		if(ba==null || bb==null){
			throw new Exception();
		}
	}
	public long GetCmp() throws Exception{
		checkExist();
		int minWidth=ba.getMinX();
		int minHeight=ba.getMinY();
		int Width = ba.getWidth();  
		int Height = ba.getHeight();		
		if(bb.getWidth()!=Width || bb.getHeight()!=Height) return -1;
		if(bb.getMinX()!=minWidth || bb.getMinY()!=minHeight) return -1;
		long sum=0;
		for(int i = minWidth;i < Width ;i++){
			for(int j = minHeight;j < Height ;j++){ 
				int ra=ba.getRGB(i, j);
				int rb=bb.getRGB(i, j);
				if((ra&0x00ffffff)!=(rb&0x00ffffff)){
					sum+=1;
				}
			}
		}
		return sum;
	}
}

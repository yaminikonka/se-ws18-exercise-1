
import java.io.*;
public class Image{
	
    public byte[] data;
    int width;
    int height;


Image(int width,int height){
	this.width=width;
	this.height=height;
    int size=(width*height)*3;
    data = new byte[size];
}
void set (int x,int y,int val){
	System.out.println("test123");
	assert(val < 0x1000000);
	int position=(x+y*width)*3;
	int R=(val&0xFF0000)<<16;
	int G=(val&0x00FF00)<<8;
	int B=(val&0x0000FF);
	data[position]=(byte)R;
	data[position+1]=(byte)G;
	data[position+2]=(byte)B;
}
public void write(String filename) throws IOException{
      try{

      FileOutputStream file=new FileOutputStream("image.ppm");
      // BufferedOutputStream Buffer=new BufferedOutputStream(filename);
      file.write(data);
      file.close();
      // filename.close();
      }
      catch(Exception e){
      	System.out.println("you have the error");
      }
// public void write(String filename){
// 		OutputStream opStream = null;
// 	    try {
	        
// 	        File myFile = new File(" image.ppm");
// 	        // check if file exist, otherwise create the file before writing
// 	        if (!myFile.exists()) {
// 	            myFile.createNewFile();
// 	        }
// 	        opStream = new FileOutputStream(myFile);
// 	        opStream.write(data);
// 	        opStream.flush();
// 	    } catch (IOException e) {
// 	        e.printStackTrace();
// 	    } finally{
// 	        try{
// 	            if(opStream != null) opStream.close();
// 	        } catch(Exception ex){
	             
// 	        }
// 	    }
}

}



///// THIS IS FOR TEST THE CODE


/*public class test{
	public static void main(String args[]){
	  image im=new image();
	   im.set(0,0,0*123456);
	   int.getx;
	   int.setx=100;
	   int.gety;
	   int.sety=100;



	}*/

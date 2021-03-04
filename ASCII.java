/*
 * ASCII.java
 * 
 * Copyright 2021 Yashar Nishaburi <yasharnishaburi@10-72-120-145.wifi.8.s.pas.ofs.edu.sg>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 * 
 * ------------------DONT FORGET TO ADD YOUR FILE PATH!!!!!!------------------
 */

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Color;
import java.util.*;
import java.awt.Frame;

public class ASCII extends Frame 
{
	public static void main (String[] args)throws Exception  
	{
		String path = "-------FILE PATH-------"; //THE PATH TO THE FOLDER WHERE THE PICTURES WILL BE IN.
		Scanner sc= new Scanner(System.in);
		System.out.print("Image name: ");
		String input = sc.nextLine();
		System.out.print("image format: ");  
		String format = sc.nextLine();
		BufferedImage img = ImageIO.read(new File(path + input +"."+ format));
		int h = img.getHeight();
		int w = img.getWidth();
		for ( int x = 0 ; x < h ; x++ )
		{
			for ( int y = 0 ; y < w ;y++ )
			{
				Color c = new Color(img.getRGB(y,x));
				int gray = (c.getRed() + c.getBlue() + c.getGreen()) /3;
				if (gray > 238)
					System.out.print("  ");
				else if (gray > 221)
					System.out.print("..");
				else if (gray > 204)
					System.out.print(",,");
				else if (gray > 187)
					System.out.print("::");
				else if (gray > 170)
					System.out.print("--");
				else if (gray > 153)
					System.out.print("~~");
				else if (gray > 136)
					System.out.print("==");
				else if (gray > 119)
					System.out.print("JJ");
				else if (gray > 102)
					System.out.print("**");
				else if (gray > 85)
					System.out.print("HH");
				else if (gray > 68)
					System.out.print("MM");
				else if (gray > 51)
					System.out.print("%%");
				else if (gray > 34)
					System.out.print("@@");
				else if (gray > 17)
					System.out.print("$$");
				else
					System.out.print("##");
			}
			System.out.println();
			//new GUIDIS();
		}
	}
}


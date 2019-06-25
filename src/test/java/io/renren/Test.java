package io.renren;

import java.io.File;
import java.util.Date;

import org.joda.time.DateTime;

public class Test {

	public static void main(String[] args) {
		String baseFolder = "https://paapi.sze511.com/traffic_hand_backstage_api" + File.separator + "images";
		
		//System.out.println(new DateTime(new Date()).toString("yyyy-MM-dd"));
		//删除D:/1 路径下的1.txt文件
		String filePath = "D:/ShenJiaoTouWorkspace/JiaoTongZaiShou/06编码/交接文档(zhaojd)/交通在手/2019_12_13/1.txt";
		File file = new File(filePath);
		File file2 = new File(filePath.substring(filePath.lastIndexOf("/")+1));
		
		System.out.println(file2);
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		//System.out.println(File.separator);
		//System.out.println(baseFolder);
		//System.out.println(file.delete());
		
		
		
	}

}

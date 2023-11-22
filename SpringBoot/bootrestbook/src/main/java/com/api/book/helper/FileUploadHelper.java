package com.api.book.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	
	//public final String Upload_DIR= "/home/harshit_ranawat/sts-workspace/bootrestbook/src/main/resources/static/image";
	public final String Upload_DIR = new ClassPathResource("static/image/").getFile().getAbsolutePath();
	
	public FileUploadHelper() throws IOException{
		
	}
	
	
	public boolean uploadFile(MultipartFile file) {
		boolean f = false;
		
		try {
			
//			//read
//			InputStream is = file.getInputStream();
//			byte data[] = new byte[is.available()];
//			
//			is.read(data);
//			
//			//write
//			FileOutputStream fos = new FileOutputStream(Upload_DIR+File.separator+file.getOriginalFilename());
//			fos.write(data);
//			
//			fos.flush();
//			fos.close();
			
			Files.copy(file.getInputStream(), Paths.get(Upload_DIR+File.separator+file.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
			
			
			f=true;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return f;
	}
}

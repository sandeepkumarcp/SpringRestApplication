package com.journaldev.spring.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.journaldev.spring.model.ImageURL;

/**
 * Handles requests for the Employee service.
 */
@Controller
public class ImageController {
	
	private static final Logger logger = LoggerFactory.getLogger(ImageController.class);
	Map<Integer, ImageURL> imgData = new HashMap<Integer, ImageURL>();
	
	@RequestMapping(value = RestURIConstants.GET_IMG_URL, method = RequestMethod.GET)
	public @ResponseBody ImageURL getImageURL() {
		logger.info("Start getImageURL");
		
		
		ImageURL img = new ImageURL();
		img.setCopyright("SANDEEP");
		img.setExplanation("Dummy");
		img.setMedia_type("image");
		img.setService_version("v1");
		img.setTitle("MergeHeatMapImage");
		img.setUrl("http://nllr4000294172.solon.prd:9999/SpringRestExample/grey_jeep_recent.jpg");
		img.setHdurl("http://nllr4000294172.solon.prd:9999/SpringRestExample/grey_jeep_recent.jpg");
		img.setCreatedDate(new Date());
		imgData.put(9999, img);
		return img;
	}
	
	@RequestMapping(value = RestURIConstants.CREATE_IMG, method = RequestMethod.POST)
	public @ResponseBody ImageURL createImage(@RequestBody ImageURL img) {
		logger.info("Start createImage.");
		img.setCreatedDate(new Date());
		imgData.put(1000, img);
		return img;
	}
	
	@RequestMapping(value = RestURIConstants.CREATE_IMG_FILE, method = RequestMethod.POST)
	public @ResponseBody ImageURL createImage(@RequestParam("file") MultipartFile file) {
		logger.info("Start createImage.");
	    String name = "test11";
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream =   new BufferedOutputStream(new FileOutputStream(new File(name + "-uploaded")));
                stream.write(bytes);
                stream.close();
                //return "You successfully uploaded " + name + " into " + name + "-uploaded !";
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
          //  return "You failed to upload " + name + " because the file was empty.";
        }
		ImageURL img = new ImageURL();
		img.setCopyright("SANDEEP");
		img.setExplanation("Dummy");
		img.setMedia_type("image");
		img.setService_version("v1");
		img.setTitle("MergeHeatMapImage");
		img.setUrl("http://nllr4000294172.solon.prd:9999/SpringRestExample/grey_jeep_recent.jpg");
		img.setHdurl("http://nllr4000294172.solon.prd:9999/SpringRestExample/grey_jeep_recent.jpg");
		img.setCreatedDate(new Date());
		imgData.put(1000, img);
		return img;
	}
	
}

package com.wildcodeschool.myDoctors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyDoctorsApplication {

	@RequestMapping("/")
    @ResponseBody
    public String index() {
		String result = "<ul><li><a href=\"/doctor/10\">Doctor 10</a></li>" +
							"<li><a href=\"/doctor/11\">Doctor 11</a></li>" +
							"<li><a href=\"/doctor/12\">Doctor 12</a></li>" +
							"<li><a href=\"/doctor/13\">Doctor 13</a></li>" +
						"</ul>";
        return result;
	}

	@RequestMapping("/doctor/10")
    @ResponseBody
    public String tenthDoctor() {
        return "David Tennant<br><a href=\"/\">back</a>";
	}
	
	@RequestMapping("/doctor/11")
    @ResponseBody
    public String eleventhDoctor() {
        return "Matt Smith<br><a href=\"/\">back</a>";
	}
	
	@RequestMapping("/doctor/12")
    @ResponseBody
    public String twelfthDoctor() {
        return "Peter Capaldi<br><a href=\"/\">back</a>";
	}
	
	@RequestMapping("/doctor/13")
    @ResponseBody
    public String thirteenthDoctor() {
        return "Jodie Whittaker<br><a href=\"/\">back</a>";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyDoctorsApplication.class, args);
	}

}

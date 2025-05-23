package com.example.github_cicd_github.actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController


public class GithubCicdGithubActionsApplication {

    @GetMapping("/welcome")
	public String welcome(){
		return "welcome to github docker image";
	}

/**	echo "# github-ci-cd" >> README.md
	git init
	git add README.md
	git commit -m "first commit"
	git branch -M main
	git remote add origin https://github.com/kasiviswanadh45/github-ci-cd.git
	git push -u origin main  **/

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdGithubActionsApplication.class, args);
	}

}

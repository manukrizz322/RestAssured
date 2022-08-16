package com.ems.json_schema_validation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class HamcrestMatcherJsonSchemaValidation {
	@Test
	private void validate() throws IOException {
		File inputJson=new File("src\\test\\resources\\input.json");
		String readFileToString = FileUtils.readFileToString(inputJson,"UTF-8");
		File jsonShema=new File("src\\test\\resources\\schema.json");
		MatcherAssert.assertThat(readFileToString, JsonSchemaValidator.matchesJsonSchema(jsonShema));
	}

}

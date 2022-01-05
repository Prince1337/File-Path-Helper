package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class FilePathHelperTest {

  FilePathHelper filePathHelper;

  @BeforeEach
  void setUp() {
    filePathHelper = new FilePathHelper();
  }

  @Test
  void testRelativeFilePathWithTilde(){
    String filePath = "~/Downloads/mountains.jpg";
    String expected = "C:\\Users\\Prince\\Downloads\\mountains.jpg";

    String actual = filePathHelper.makeAbsolut(filePath);

    assertEquals(expected, actual, "Relative FilePath couldn't be converted into an absolute FilePath");
  }

  @Test
  void testRelativeFilePathWithDot(){
    String filePath = "./bin/debug/samples/config.json";
    String expected = "C:\\Users\\Prince\\Desktop\\Coding\\6.File Path Helper\\bin\\debug\\samples\\config.json";

    String actual = filePathHelper.makeAbsolut(filePath);

    assertEquals(expected, actual, "Relative FilePath couldn't be converted into an absolute FilePath");
  }

  @Test
  void testRelativePathIsRelativeWithTilde(){
    String filePath = "~/Downloads/mountains.jpg";

    boolean actual = filePathHelper.isRelative(filePath);

    assertTrue(actual);
  }

  @Test
  void testRelativePathIsRelativeWithDot(){
    String filePath = "./bin/debug/samples/config.json";

    boolean actual = filePathHelper.isRelative(filePath);

    assertTrue(actual);
  }


  @Test
  void testRelativePathIsRelativeWithBackslash(){
    String filePath = "\\Users\\brucew\\Projects\\ETF\\bin\\..\\program.cs";

    boolean actual = filePathHelper.isRelative(filePath);

    assertTrue(actual);
  }
}
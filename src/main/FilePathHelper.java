package main;

public class FilePathHelper {

  public String makeAbsolut (String filePath){
    if(isRelative(filePath))
    {
      String adjustedFilePath ="";

      if(filePath.startsWith("~"))
        adjustedFilePath = filePath.replace("~", System.getProperty("user.home"));

      if(filePath.startsWith(".")) {
        adjustedFilePath = filePath.substring(1);
        adjustedFilePath = System.getProperty("user.dir") + adjustedFilePath;
      }

      return adjustedFilePath.replace("/", "\\");
    }

    return filePath;
  }

  public boolean isRelative(String filePath) {
    return filePath.startsWith("~") || filePath.startsWith(".") || filePath.startsWith("\\");
  }
}

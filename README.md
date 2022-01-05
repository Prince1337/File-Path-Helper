File Path Helper
Function Kata „File Path Helper“
Write a function to guarantee a file path to be absolute, e.g. `string FilePathHelper.MakeAbsolute(string filePath)`

The function detects if a path is relative and if so converts it to an absolute path by treating `~`, `.`, `..` appropriately. The absolute path should not contain such „placeholders“ anymore.

Example:

„~/Downloads/mountains.jpg“ becomes „/Users/brucew/Downloads/mountains.jpg“ (with „/Users/brucew“ being the current home directory)
„./bin/debug/samples/config.json“ becomes „/Users/brucew/Projects/ETF/bin/debug/samples/config.json“ (with „/Users/brucew/Projects/ETF“ being the current working directory)
„/Users/brucew/Projects/ETF/bin/../program.cs“ becomes „Users/brucew/Projects/ETF/program.cs“
The path delimiter is dependent on the operating system at runtime, e.g. \ on Windows and / on Linux/macOS.

On Windows a drive prefix like c: should be retained.
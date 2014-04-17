package com.bharath0091.file;

import java.io.File;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("D:/dev/Workspace/github/corejava/file/resources/test.txt");
		System.out.println("file.getParent() :" + file.getParent());
		System.out.println("exists :" + file.exists());
		System.out.println("file.getAbsolutePath() :" + file.getAbsolutePath());
		System.out.println("**********");
		
		File file2 = new File("/resources/test.txt");
		System.out.println("file.getParent() :" + file2.getParent());
		System.out.println("exists :" + file2.exists());
		System.out.println("file.getAbsolutePath() :" + file2.getAbsolutePath());
		System.out.println("**********");
		
		File file3 = new File("resources/test.txt");
		System.out.println("file.getParent() :" + file3.getParent());
		System.out.println("exists :" + file3.exists());
		System.out.println("file.getAbsolutePath() :" + file3.getAbsolutePath());
		System.out.println("**********");
		
		File file4 = new File("D:\\dev\\Workspace\\github\\corejava\\file\\resources\\test.txt");
		System.out.println("file.getParent() :" + file4.getParent());
		System.out.println("exists :" + file4.exists());
		System.out.println("file.getAbsolutePath() :" + file4.getAbsolutePath());
		System.out.println("**********");
		
		/*
		 * The prefix concept is used to handle root directories on UNIX
		 * platforms, and drive specifiers, root directories and UNC pathnames
		 * on Microsoft Windows platforms, as follows:
		 * 
		 * For UNIX platforms, the prefix of an absolute pathname is always "/".
		 * Relative pathnames have no prefix. The abstract pathname denoting the
		 * root directory has the prefix "/" and an empty name sequence.
		 * 
		 *  For Microsoft Windows platforms, the prefix of a pathname that contains a
		 * drive specifier consists of the drive letter followed by ":" and
		 * possibly followed by "\\" if the pathname is absolute. The prefix of
		 * a UNC pathname is "\\\\"; the hostname and the share name are the
		 * first two names in the name sequence. A relative pathname that does
		 * not specify a drive has no prefix.
		 */
	}
}

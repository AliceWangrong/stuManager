package com.test;

import com.utils.ReadDepthFile;
/*import com.utils.ReadFile;*/
import com.utils.Tree;
import org.junit.Test;

import java.io.File;

public class FileText {
    @Test
    public void Depth(){
        ReadDepthFile file=new ReadDepthFile();
        File file2 = new File("C:\\Users\\Lenovo\\IdeaProjects\\stuManager\\target\\stuManager\\upload\\1561794121749667\\");
        Tree tree=file.FileRowList(file2);
        System.out.println(tree);

    }
}

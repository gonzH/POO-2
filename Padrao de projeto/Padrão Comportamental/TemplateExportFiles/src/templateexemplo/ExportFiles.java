
package templateexemplo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;


/*Esse codigo esta uma bangunca..*/

public abstract class ExportFiles {

    BufferedWriter out = null;
    XWPFDocument document;
    FileOutputStream out1 = null;

    /* definindo esqueleto */
    public void exportGenerico(String txt) {
        String[] txtLinhas = txt.split("\n");
        for(Object linhas : txtLinhas )
        {
            printLine((String)linhas);
        }   
        save();
    }
    
    protected abstract void printLine(String linha);
    protected abstract void save();

}

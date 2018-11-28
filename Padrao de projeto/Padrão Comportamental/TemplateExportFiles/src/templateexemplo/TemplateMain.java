
package templateexemplo;


public class TemplateMain {

   
    public static void main(String[] args) {
        ExportFiles efHtml = new ExportFileHtml();
        ExportFiles efWord = new ExportFileWord();
        
        String texto = "linha 1\n" 
                + "linha2\n"
                + "fim\n";                                
      
      efHtml.exportGenerico(texto);
      efWord.exportGenerico(texto);
    }
    
}

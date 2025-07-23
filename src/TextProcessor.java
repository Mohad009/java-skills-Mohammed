
public class TextProcessor {
    
    public static int countWords(String sentence) { 
        int count=0;
        if(sentence.length()!=0){

            String []splitted=sentence.split("\\s");
            
            for(int i=0;i<splitted.length;i++){
                count++;
                
            }
        }else{System.out.println("String is empty, enter something.");}
return count;

    } 



        // Replace specific words 
    public static String replaceWord(String text, String oldWord, String 
newWord) { 
    return text.replace(oldWord, newWord);
    } 
     
    public static void main(String[] args) { 
        System.out.println("Count of words: "+TextProcessor.countWords("Java is fun and Java is powerful"));
        System.out.println("New Text: "+TextProcessor.replaceWord("Java is fun and Java is powerful", "Java","Programming"));
    } 
} 


import java.io.*;
import java.lang.*;

class Intern
{ 
    public static void main(String[] args) throws IOException  
    { 
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
        int rows,columns,temp = 0;

        String sentence, sentenceWtihNoSpace = "";

        do{
            //getting the input from the user
            System.out.println("Please the sentence:");
            sentence = reader.readLine(); 
        
            //removing the spaces
            sentenceWtihNoSpace = sentence.replaceAll("\\s+", "");

             //calculating rows and columns
            rows = (int)Math.sqrt(sentenceWtihNoSpace.length());
            columns = rows + 1;

            temp = rows * columns;
            //Ensure that rows x columns >= L
        }while(temp < sentenceWtihNoSpace.length());

        //declare a matrix to split the whole sentence into lines
        char[][] matrix = new char[rows+1][columns+1];

        //reasigne temp to be 0 as a counter
        temp = 0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                //make sure there are charaters need to be asigne
                if(temp <sentenceWtihNoSpace.length()){
                    matrix[i][j] = sentenceWtihNoSpace.charAt(temp);
                }
                temp++;
            }   
        }

        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                System.out.print(matrix[j][i]);  
            } 
            System.out.print(" ");
        }
        
        
    } 
} 

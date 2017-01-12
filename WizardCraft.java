package wizard.craft;

import java.util.ArrayList;
import java.util.Scanner;




public class WizardCraft{
    
            public static Scanner in = new Scanner(System.in);     
            
    public static void main(String[] args) {
        
        BigString stringin = new BigString();
                Guesser hello = new Guesser();

        String thestring = null;
        stringin.s = thestring;  
        
  
        String[] eachwordresult = stringin.eachwordresult;
        

        
        System.out.println("Welcome to Word Wizard 9000");
        System.out.println("===========================");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
ArrayList<String> potentialwordsRHYME = new ArrayList<String>();
ArrayList<String> potentialwords1 = new ArrayList<String>();
ArrayList<String> potentialwords2 = new ArrayList<String>();
ArrayList<String> potentialwords3 = new ArrayList<String>();
ArrayList<String> potentialwords4 = new ArrayList<String>();

        System.out.println("Think of a pretty common noun.");
        System.out.println("Don't forget it!");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Enter a word that rhymes with your word: ");
        
        
        
        
        
        
                        System.out.println("");
                        System.out.println("");
                        String x = in.nextLine();
    
                                        //RHYME CHECK!
            for (int i = 0; i < eachwordresult.length ; i++)                                {
            //System.out.println("Fetching RHYMABLE Algorithms...");
            
            if ((eachwordresult[i]).length() > 1) {
            x = x.toLowerCase();
            String x0 = x.replaceAll(" ", "");
            
            String n = eachwordresult[i];
            
            int rhymer = (eachwordresult[i]).length();
            int yourwordrhymer = (x0.length());
            
            
            if (x.length() >= 4 && eachwordresult[i].length() >= 4) {
            String ndone = (n.substring(rhymer-3, rhymer));
            String x0done = (x0.substring(yourwordrhymer-3, yourwordrhymer));
            if ((ndone.equals(x0done))) {
                            potentialwordsRHYME.add(eachwordresult[i]);
                            //System.out.println("RHYMERS : " +eachwordresult[i]);          
                                        }
                
            } else if (x.length() >= 3 || eachwordresult[i].length() >= 3 && !(potentialwordsRHYME.contains(eachwordresult[i]))) {
            String ndone = (n.substring(rhymer-2, rhymer));
            String x0done = (x0.substring(yourwordrhymer-2, yourwordrhymer));
            if ((ndone.equals(x0done))) {
                            potentialwordsRHYME.add(eachwordresult[i]);
                            //System.out.println("RHYMERS : " +eachwordresult[i]); 
                                        }
            }
            
            
            
            }   
}
            
            
            
            
            
            
                                        if (potentialwordsRHYME.size() > 1) {

                                                        //first one(AFTER RHYME CHECK)
                            System.out.println("");
                            System.out.println("Enter the first letter to your word: ");
                            System.out.println("");
                            System.out.println("");
                            String x1 = in.nextLine();

        for (int i = 0; i < potentialwordsRHYME.size() ; i++)                                {
            //System.out.println("Fetching Algorithms FIRST LETTER...");
            if ((potentialwordsRHYME.get(i)).length() > 1) {

            String n = potentialwordsRHYME.get(i);


            char theletter = x1.charAt(0);
            
            char n1 = n.charAt(0);
           
                                                                      
            if (theletter == n1)
            {
                potentialwords1.add(potentialwordsRHYME.get(i)); }
                    
                }            
                                                                                             }
        
        
        
        
        
        
                                            if (potentialwords1.size() > 1) {

        
        
                                    //second one
        System.out.println("");
                System.out.println("Enter the second letter to your word: ");
        System.out.println("");
        System.out.println("");
        String x2 = in.nextLine();
        
        for (int i = 0; i < potentialwords1.size() ; i++)                                {
            //System.out.println("Fetching Algorithms SECOND LETTER...");
            if ((potentialwords1.get(i)).length() > 1) {

            String n = potentialwords1.get(i);
            
            char theletter = x2.charAt(0);
            
            char n2 = n.charAt(1);
                     
                                                                      
            if (theletter == n2)
            {
                potentialwords2.add(potentialwords1.get(i));
                        //System.out.println("with second letter word: "+potentialwords1.get(i)); 
            }
             
            }
                                                                                          }
        
        
        
        
        
        
                                            if (potentialwords2.size() > 1) {

        
                                  //third one
        System.out.println("");
        System.out.println("Enter the third letter to your word: ");
        System.out.println("");
        System.out.println("");
        String x3 = in.nextLine();

        for (int i = 0; i < potentialwords2.size() ; i++)                                {
            //System.out.println("Fetching Algorithms THIRD LETTER...");
            
            if ((potentialwords2.get(i)).length() > 1) {

                
            String n = potentialwords2.get(i);
if (potentialwords2.get(i).length() > 1) {
            char theletter = x3.charAt(0);
            
            char n3 = n.charAt(2);
                     
                                                                      
            if (theletter == n3)
            {
                potentialwords3.add(potentialwords2.get(i));
                        //System.out.println("with third letter "+potentialwords2.get(i)); 
            }
                }
    }
                                                                                        }
        
        
        
        
        
        
                                   if (potentialwords3.size() > 1) {

        
                                          //fourth one
        System.out.println("");
        System.out.println("Enter the fourth letter to your word: ");
        System.out.println("");
        System.out.println("");
        String x4 = in.nextLine();

        for (int i = 0; i < potentialwords3.size() ; i++)                                {
            //System.out.println("Fetching Algorithms THIRD LETTER...");
            
            if ((potentialwords3.get(i)).length() > 1) {

                
            String n = potentialwords3.get(i);
if (potentialwords3.get(i).length() > 1) {
            char theletter = x4.charAt(0);
            
            char n4 = n.charAt(3);
                     
                                                                      
            if (theletter == n4)
            {
                potentialwords4.add(potentialwords3.get(i));
                        //System.out.println("with fourth letter "+potentialwords3.get(i)); 
            }
                }
    }
                                                                                        }
        
        

       
        
        
                         }
                                            
                                        hello.Hello();
                                        System.out.println("\t    "+(potentialwords3.toString()));
                                            System.out.println("");
                                            System.out.println("");
                                                                                System.exit(0);
                                  
                                    
                                    
                    }
                                            
                                        hello.Hello();
                                        System.out.println("\t    "+(potentialwords2.toString()));
                                            System.out.println("");
                                            System.out.println("");
                                                                                System.exit(0);


                                    
                                    
                                    
               }
                            
                                        hello.Hello();
                                        System.out.println("\t    "+(potentialwords1.toString()));
                                            System.out.println("");
                                            System.out.println("");
                                                                                System.exit(0);
                                                                                
         }
                                        hello.Hello();
                                        System.out.println("\t    " +(potentialwordsRHYME.toString()));
                                            System.out.println("");
                                            System.out.println("");
                            
                                                                                System.exit(0);

                            
                            
                            
        }
}


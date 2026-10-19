/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepartone;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Student
 */
class Message { ArrayList<String> messageIds = new ArrayList<>();
    ArrayList<String> recipientNumber = new ArrayList<>();
    ArrayList<String> messages = new ArrayList<>();
    ArrayList<String> msgHash = new ArrayList<>();
//    ArrayList<Static> int totalMesage= 0;
    
    
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    
  public void sendingMessages(){
      System.out.println("How many messages do you want to send?");
      int numberofMessages = input.nextInt();
      for(int l = 1; l <= numberofMessages; l++){
          System.out.println("Message:" + l);
          String messageID = generateMessageID();
          System.out.println("Enter the reciepients cellphone number");
          String recipient = input.nextLine();
          
          String recipientResult = checkRecipientCell(recipient);
                  if (!recipientResult.equals("Valid number")){
                      System.out.println(recipientResult);
                      l = l - 1;
                      continue;
                  }
                  recipientNumber.add(recipient);
                  System.out.println("Enter your message");
                  String messageText = input.nextLine();
                  if(messageText.length() > 250 
                          || messageText.trim().isEmpty()){
                      System.out.println("Your message should be between 1 to 250 characters");
                      l = l - 1;
                      continue;
                  }
                  messages.add(messageText);
                  String messageHash = createMessageHash(messageID, messages.size(), messageText);
                  msgHash.add(messageHash);
      }
      for(int l = 0; l < messages.size(); l++){
  System.out.println("\n====== Message details======");
  System.out.println("Message Id:" + messageIds.get(l) );
  System.out.println("Recipient:" + recipientNumber.get(l));
  System.out.println("Message:" + messages.get(l));
  System.out.println("Message Hash:" + msgHash.get(l));
}
  } 
  
  
  public String generateMessageID(){
      String messageID;
      do{
          long number = 1000000000L + random.nextLong(9000000000L);
          messageID = String.valueOf(number);
      }
      while(messageIds.contains(messageID));
      messageIds.add(messageID);
      return messageID;
              }
  public String checkRecipientCell(String cellphone) {

        if (cellphone.matches("^\\+27[0-9]{9}$")
                || cellphone.matches("^0[0-9]{9}$")) {

            return "Valid number";

        } else {

            return "Invalid number. Please enter a valid South African number.";
        }
    }
  public String createMessageHash(String messageID,int messageNumber,String messageText){
      String firstTwoNumbers = messageID.substring(0,2);
      String trimmedMessage = messageText.trim();
      String[] words = trimmedMessage.split("\\s+");
      String firstWord = words[0];
      String lastWord = words[words.length - 1];
      String hash = firstTwoNumbers 
              + ":"
              + messageNumber
              +"."
              +firstWord
              +lastWord;
      return hash.toUpperCase();
      
  }

    private static class Static {

        public Static() {
        }
    }
        public boolean checkMessageIds(String messageIds){
            return messageIds.length()<= 10;
        }
        public String printMessages(){
            return
                    "\nMessageID:"+messageIds+
                    "\nHash"+msgHash +
                    "\nRecipient:"+recipientNumber+
                    "\nMessage:"+messages ;
        }
        public int returnTotalMessage(){
        int totalmessages = 0;
            return totalmessages;
        }
        public void storeMessage(String recipientNumber,
                String message){
            Random random= new Random();
            long num= 100000000L 
                    +(long)(random.nextDouble()* 9000000000L);
//            this.messageIds= String.valueof(num);
        }
  }


    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Juan
 */
public class MessageCopierService {
    private String ln;
    private MessageInput messageInput;
    private MessageOutput messageOutput;

    public MessageCopierService(MessageInput input, MessageOutput output) {
        this.messageInput = input;
        this.messageOutput = output;
    }
    
    public void getLn(MessageInput messageInput){
        this.ln = messageInput.inputLn();
    }
    public void setLn(){
        messageOutput.outputLn(ln);
    }
}

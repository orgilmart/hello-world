package mydev;

import java.util.ArrayList;

public class Database {
	private ArrayList<User> users = new ArrayList<User>();
	private ArrayList<Contact> contacts = new ArrayList<Contact>();
	
	public boolean checkUser(User a){
		for(int i=0; i<users.size(); i++){
			if(users.get(i).getUser().equals(a.getUser()) 
					&& users.get(i).getPassword().equals(a.getPassword()) ){
				return true;
			}
		}
		
		return false;
	}
	
	public void addContact(Contact c){
		contacts.add(c);
	}
	
	public void showContactLists(){
		for(int i=0; i<contacts.size(); i++){
			contacts.get(i).toString();
		}
	}
	
	public void search(Contact c){
		for(int i=0; i<contacts.size(); i++){
			if(contacts.get(i).getName().equals(c.getName())){
				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

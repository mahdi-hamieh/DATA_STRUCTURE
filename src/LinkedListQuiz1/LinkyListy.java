package LinkedListQuiz1;

public class LinkyListy {
 public static void main(String[] args){
     LinkedList LinkyListy = new LinkedList(new Node(12,null));
     LinkyListy.add(new Node(11,null));
     LinkyListy.add(new Node(13,null));
     LinkyListy.Display();
     System.out.println("After Delete");
     LinkyListy.Delete();
     LinkyListy.Display();
 }
}

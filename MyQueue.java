public class MyQueue {
public static void main(String[] args) {
    Queue myQueue = new Queue();
    myQueue.enQueue(3);
    myQueue.enQueue(2);
    myQueue.enQueue(1);
    myQueue.display();
    myQueue.deQueue();
    myQueue.peek();
}
}
class Queue {
  int queueLength = 3;
  int items[] = new int[queueLength];
  int front = -1;
  int back = -1;
    //Проверка полноты очереди
  boolean isFull(){ 
      if(back == queueLength - 1){
          return true;
      } else {
          return false;
      }
  }
    // Функция проверки пустоты очереди
  boolean isEmpty(){
      if(front == -1 && back == -1){ //Если значения front и back имеют значения по умолчанию, значит очередь пуста
          return true;
      } else {
          return false;
      }
  }
    //Метод добавления элементо в очередь
   void enQueue(int itemValue) {
      if(isFull()){
          System.out.println("Queue is full");
      } else if(front == -1 && back == -1){ //Если очередь пуста
          front = back = 0;
          items[back] = itemValue; //Присваиваем новому элементу последнее место 
      } else{
          back++; //Увеличиваем счетчик на 1 вставляем элемент на последнее место
          items[back] = itemValue;
      }
  }
   void deQueue(){
      if(isEmpty()){
          System.out.println("Queue is empty. Nothing to dequeue");
      } else if (front == back){ //Если в очереди один элемент, просто сбрасываем значения front и back
          front = back = -1;
      } else {
          front++; //Перемещаем front на одну ячейку
      }
  }
  void display(){
      int i;
      if(isEmpty()){
          System.out.println("Queue is empty");
      } else {
          for(i = front; i <= back; i++){
              System.out.println(items[i]);
          }
      }
  }
  void peek(){
      System.out.println("Front value is: " + items[front]);
  }
}

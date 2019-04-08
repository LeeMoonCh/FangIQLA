import java.util.concurrent.TimeUnit

import akka.actor.{ActorSystem, Props}
import akka.pattern.Patterns
import akka.util.Timeout

object DoMain extends App{


  val as = ActorSystem
  val teacher = new Teacher()

  val myActorRef = as.apply().actorOf(Props(new MyActor(teacher)))


//  myActorRef ! S("你是谁?")

  Patterns.ask(myActorRef,S("你猜?"),Timeout(1000,TimeUnit.MICROSECONDS))
  var a = 0;
  while(true){
    Thread.sleep(1000)
    a = a+1
    Patterns.ask(myActorRef,S("你猜?"+a),Timeout(1000,TimeUnit.MICROSECONDS))
  }









}

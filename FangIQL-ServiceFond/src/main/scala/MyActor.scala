import akka.actor.Actor

class MyActor(_teacher:Teacher) extends Actor{

  private var teacher:Teacher = _
  override def receive: Receive = {
    case S(q:String) => {
      teacher.huiDA(q)
    }
    case _ => sender() ! "你没问我问题,你逗我呢."

  }

  override def preStart(): Unit ={
    teacher = _teacher
  }

  override def postStop(): Unit = super.postStop()
}





object MyActor {

}

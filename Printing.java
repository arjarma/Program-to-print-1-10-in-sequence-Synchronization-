class Printer implements Runnable
{
int start;
int end;
Printing p;
Printer(Printing p,int start,int end)
{
	this.p=p;
this.start=start;
this.end=end;
}
public void run()
{
synchronized(p)
{
for(int i=start;i<=end;i++)
{
System.out.println(Thread.currentThread()+" "+i);
}
}

}
}

class Printing
{
public static void main(String agr[])
{
	Printing p=new Printing();
Thread t1=new Thread(new Printer(p,1,5));
Thread t2=new Thread(new Printer(p,6,10));

t1.start();
t2.start();
}
}
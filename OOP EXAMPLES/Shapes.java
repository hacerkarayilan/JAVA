package udemy;

public class Shapes {
public Point[] shapelist=new Point[20];	
public double getTotalArea() {
	double sum=0;
	for(int i=0;i<20;i++) {
		if (shapelist[i]!=null) {
			sum=sum+ shapelist[i].GetArea();
		}
	}
	return sum;
}
	
public int getCircleCount () {
	int count=0;
	for(int i=0;i<20;i++) {
		if (shapelist[i] instanceof Circle) {
			count++;
		}
	}
	return count;
}

public int getRactangleCount  () {
	int count=0;
	for(int i=0;i<20;i++) {
		if (shapelist[i] instanceof Rectangle) {
			count++;
		}
	}
	return count;
}
}

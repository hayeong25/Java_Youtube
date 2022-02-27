package Class;

// 하나의 점을 의미하는 Node 클래스 생성

public class Node {

	private int x; // private : 외부에서 접근 불가
	private int y;
	public int getX() { // private 변수이기 때문에  
		return x;
	}
	public void setX(int x) { // x값 설정
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) { // y값 설정
		this.y = y;
	}
	public Node(int x, int y) { // 생성자(클래스 이름과 동일해야 한다)
		this.x = x;
		this.y = y;
	}
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	}	
}
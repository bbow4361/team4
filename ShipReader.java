package JFrame_Tests;

public class ShipReader extends Graphics1{
	
	VirtualBoard vb = new VirtualBoard();
	int xVal;
	int yVal;
	
	public void getMove(char coordinate1, int coordinate2, VirtualBoard VBoard){
		char coord1 = coordinate1;
		int converted =	char2int(coord1);
		xVal = converted;
		yVal = coordinate2;
		boolean hit = shipCheck(VBoard);
		Graphics1.update(xVal, yVal, hit);
	}
	
	public boolean shipCheck(VirtualBoard VBoard){
		boolean hit = false;
		return hit;
	}

	private int char2int(char coord1) {
		char converter = coord1;
		int value;
		switch (converter){
			case 'a':
				value = 1;
				break;
			case 'A':
				value = 1;
				break;
			case 'B':
				value = 2;
				break;
			case 'b':
				value = 2;
				break;
			case 'c':
				value = 3;
				break;
			case 'C':
				value = 3;
				break;
			case 'D':
				value = 4;
				break;
			case 'd':
				value = 4;
				break;
			case 'e':
				value = 5;
				break;
			case 'E':
				value = 5;
				break;
			case 'f':
				value = 6;
				break;
			case 'F':
				value = 6;
				break;
			case 'G':
				value = 7;
				break;
			case 'g':
				value = 7;
				break;
			case 'h':
				value = 8;
				break;
			case 'H':
				value = 8;
				break;
			case 'I':
				value = 9;
				break;
			case 'i':
				value = 9;
				break;
			case 'j':
				value = 10;
				break;
			case 'J':
				value = 10;
				break;
			default:
				value = -1;
				break;
		}
		return value;
	}
	
}


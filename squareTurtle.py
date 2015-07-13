import turtle

def makeSquare():
	t = turtle
	widthOfBox = 200
	heightOfBox = 200
		
	while(True):
		currentX = t.xcor()
		currentY = t.ycor()
		
		if(currentX <= 0 or currentX <= widthOfBox):
			t.forward(widthOfBox)
			t.left(90)
		
		if(currentY <= 0 or currentY <= heightOfBox):
			t.forward(widthOfBox)
			t.left(90)
makeSquare()

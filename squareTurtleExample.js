function makeSquare(){
        var t = turtle();
        var widthOfBox = 200;
        var heightOfBox = 200;

        while(true){
                var currentX = t.getX();
                var currentY = t.getY();

                if(currentX <= 0 || currentX <= widthOfBox){
                        t.forward(widthOfBox);
                        t.left(90);
                };

                if(currentY <= 0 || currentY <= heightOfBox){
                        t.forward(widthOfBox);
                        t.left(90);
                };
        }
}

makeSquare();

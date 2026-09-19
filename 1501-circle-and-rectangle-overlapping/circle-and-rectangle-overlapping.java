class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        // int xi=0,yi = 0;
        // if(x1>xCenter && x2<xCenter)
        //     xi = x1;
        // else if(x2>xCenter && x1<xCenter)
        //     xi = x2;
        // else
        //     x1 = xCenter;

        int xi = Math.max(x1,Math.min(xCenter, x2));
        int yi = Math.max(y1,Math.min(yCenter, y2));

        // if(y1>yCenter)
        //     yi = y1;
        // else if(y2>yCenter)
        //     yi = y2;
        // else
        //     y1 = yCenter;
        
        int d = (int)Math.sqrt((xi-xCenter)*(xi-xCenter) + (yi-yCenter)*(yi-yCenter));
        System.out.println(d);
        if(d<=radius)
            return true;
        else 
            return false;
    }
}
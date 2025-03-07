public class Domino {
    private int topSide;
    private int bottomSide;

    public Domino(){
        this.topSide = 0;
        this.bottomSide = 0;
    }

    public Domino(int topSide, int bottomSide){
        this.topSide = topSide;
        this.bottomSide = bottomSide;

    }

    public int getTop() {
        return topSide;
    }

    public int getBottom() {
        return bottomSide;
    }

    public void setTop(int topSide) {
        this.topSide = topSide;
    }

    public void setBottom(int bottomSide) {
        this.bottomSide = bottomSide;
    }

    @Override
    public String toString() {
        return "Domino{" +
                "topSide=" + topSide +
                ", bottomSide=" + bottomSide +
                '}';
    }

    public void flip(){
        int temp;
        temp = topSide;
        topSide = bottomSide;
        bottomSide = temp;
    }

    public void settle(){
        if (topSide>bottomSide){
            flip();
        }
    }

    public int compareTo(Domino otherDomino){
        int smallest = 0;
        int largest = 0;
        int otherSmallest = 0;
        int otherLargest = 0;

        if(this.topSide > this.bottomSide){
            smallest = this.bottomSide;
            largest = this.topSide;
        } else if (this.topSide < this.bottomSide) {
            smallest = this.topSide;
            largest = this.bottomSide;
        }
        if(otherDomino.topSide > otherDomino.bottomSide){
            otherSmallest = otherDomino.bottomSide;
            otherLargest = otherDomino.topSide;
        } else if (otherDomino.topSide < otherDomino.bottomSide) {
            otherSmallest = otherDomino.topSide;
            otherLargest = otherDomino.bottomSide;
        }

        if(smallest < otherSmallest){
            return -1;
        } else if (smallest > otherSmallest) {
            return 1;
        } else {
            if(largest < otherLargest){
                return -1;
            } else if (largest > otherLargest){
                return 1;
            }
        }
        return 0;


    }

    public int compareToWeight(Domino otherDomino){
        int thisWeight = topSide + bottomSide;
        int otherWeight = otherDomino.topSide + otherDomino.bottomSide;

        if(thisWeight > otherWeight){
            return 1;
        }
        else if(otherWeight > thisWeight){
            return -1;
        }
        return 0;
    }

    public boolean canConnect(Domino otherDomino){
        return ((this.topSide == otherDomino.topSide)||
                (this.topSide == otherDomino.bottomSide)||
                (this.bottomSide == otherDomino.topSide)||
                (this.bottomSide == otherDomino.bottomSide));
    }

}


package dalieOCP.collection.list._pratice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Order {
	
	private List<OrderPosition> positionList;
	
	{
		positionList = new ArrayList<>();
	}
	
	public List<OrderPosition> getPositionList() {
		return positionList;
	}
	
	public OrderPosition determineOrderPostionByOrderPosNo(int orderPosNo) {

        OrderPosition currentOrderPosition = null;
        try {
            int posNo = Integer.valueOf(orderPosNo).intValue();
            List<OrderPosition> tmpList = this.getPositionList();
            if (null != tmpList && !tmpList.isEmpty()) {
                Iterator<OrderPosition> it = tmpList.iterator();

                while(it.hasNext()) {
                    OrderPosition p = it.next();

                    if (posNo == p.getOrdPosNo())
                    {
                        currentOrderPosition = p;
                        break;
                    }
                }
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        
        return currentOrderPosition;
    }
}


class OrderPosition {
	
	private int ordPosNo;
	
    public int getOrdPosNo() {
        return ordPosNo;
    }
}

public class P04 {

	public static void main(String[] args) {
		Order order = new Order();
		List<OrderPosition> orderPositions = order.getPositionList();
		   if(orderPositions != null && orderPositions.size() > 0)
		        for(int i = orderPositions.size()-1; i >= 0 ; i--) {
		        	
		        	OrderPosition originalPosition = order.determineOrderPostionByOrderPosNo(1);
		        	 if(originalPosition == null)
	                        continue;
		        	 
		        	 orderPositions.remove(i);
		        }
	
	}
}

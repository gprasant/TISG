package OrderStatisticTrees;

import apple.laf.JRSUIUtils;

public class OrderStatisticTreeNode {
    public OrderStatisticTreeNode left;
    public OrderStatisticTreeNode right;
    public int data;
    public int count;

    public OrderStatisticTreeNode(int data) {
        this.data = data;
    }

    /*****************************************************
     *
     *            INSERT
     *
     ******************************************************/
    public void insert(int data)
    {
        insert(this, data);
    }
    private OrderStatisticTreeNode insert(OrderStatisticTreeNode p, int toInsert)
    {
        if (p == null)
            return new OrderStatisticTreeNode(toInsert);

        if (toInsert == p.data)
            return p;

        if (toInsert < p.data)
            p.left = insert(p.left, toInsert);
        else
            p.right = insert(p.right, toInsert);

        return p;
    }
}

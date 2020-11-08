package ex1;

import ex0.node_data;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class WGraph_DS implements weighted_graph{
    private static int numberKey=0;
    private static HashSet<Integer> chekUnique;
    private HashMap<Integer,node_data> nodesWG;
    private int edges;
    private int MC;
    public WGraph_DS(){
        this.nodesWG = new HashMap<>();
        this.edges=0;
        this.MC=0;
    }
    public WGraph_DS(WGraph_DS Wgraph){

    }
    @Override
    public node_info getNode(int key) {
        return null;
    }

    @Override
    public boolean hasEdge(int node1, int node2) {
        return false;
    }

    @Override
    public double getEdge(int node1, int node2) {
        return 0;
    }

    @Override
    public void addNode(int key) {

    }

    @Override
    public void connect(int node1, int node2, double w) {

    }

    @Override
    public Collection<node_info> getV() {
        return null;
    }

    @Override
    public Collection<node_info> getV(int node_id) {
        return null;
    }

    @Override
    public node_info removeNode(int key) {
        return null;
    }

    @Override
    public void removeEdge(int node1, int node2) {

    }

    @Override
    public int nodeSize() {
        return 0;
    }

    @Override
    public int edgeSize() {
        return 0;
    }

    @Override
    public int getMC() {
        return 0;
    }

    public class NodeInfo implements node_info{
        private int key;
        private double tag;
        private String info;
        private HashMap<Integer, node_data> ni;
        private HashMap<Integer, Integer> neighborsWeight;
        public NodeInfo(){
            this(numberKey,0,"");
        }
        public NodeInfo(int key,int tag,String info) // Constructor
        {
            boolean keyused=false;
            if(chekUnique.contains(key)) {
                keyused=true;
                while (chekUnique.contains(numberKey)) {
                    numberKey++;
                }
            }
            if(keyused){
                key=numberKey;
            }
            chekUnique.add(key);
            this.setKey(key);
            this.tag=tag;
            this.info=info;
            this.ni = new HashMap<Integer, node_data>();
            ++numberKey;
        }
        @Override
        public int getKey() {
            return this.key;
        }
        private void setKey(int n){
            key=n;
        }

        @Override
        public String getInfo() {
            return this.info;
        }

        @Override
        public void setInfo(String s) {
            info=s;
        }

        @Override
        public double getTag() {
            return this.tag;
        }

        @Override
        public void setTag(double t) {
            tag=t;
        }
    }
}

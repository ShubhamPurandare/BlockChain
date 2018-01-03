import java.util.ArrayList;


public class Main {

	
	static ArrayList<Block> blocks = new ArrayList<Block>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create a genesis block(first block) which will have previous hash as 0
		String[] genesisTransactions = {"Shubham sent 100 bitcoins to rhushi"}; // first transaction
		Block genesisBlock = new Block(genesisTransactions, 0);
		blocks.add(genesisBlock);
		
		String[] block2Transactions = {"Rathin sent 40 bitcoins to kattya"};  // transaction 2
		Block block2 = new Block(block2Transactions, genesisBlock.getBlockHash());
		blocks.add(block2);
		
		System.out.println("The Digital Signature of block 1 is "+genesisBlock.getBlockHash());

		System.out.println("The Digital Signature of block 2 is "+ block2.getBlockHash());
	}

}

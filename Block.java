import java.util.Arrays;


public class Block {

	
	/* Each block contains 
	1. A list of transactions
	2. Previous Hash
	3. Current hash (based on previous hash)
	*/
	
	int previousHash;
	String[] transactions;
	int blockHash;
	
	public Block(String[] transactions , int previousHash){
		this.previousHash = previousHash;
		this.transactions = transactions;
		Object[] contents = {Arrays.hashCode(transactions) , previousHash};
		// contents will evaluate the hash based upon , previous hash and current transactions.
		// if the contents of previous transactions are changed then the value of this block hash will be changed automatically
		
		this.blockHash = Arrays.hashCode(contents);
		
	}
	
	public int getPreviousHash(){
		return this.previousHash; 
	}
	
	public String[] getTransaction(){
		return this.transactions;
		
	}
	
	public int getBlockHash(){
		return this.blockHash;
	}
	
	
}

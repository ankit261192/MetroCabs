package com.ds.metrocabs.repository.transactionmodelrepository;

import java.util.List;

import com.ds.metrocabs.model.transaction.CarForSaleRecord;

public interface CarForSaleRecordDao {
	public int save(final CarForSaleRecord carforsalerecord) throws Exception;
	public boolean update(final CarForSaleRecord carforsalerecord) throws Exception;
	public boolean delete(final CarForSaleRecord carforsalerecord) throws Exception;
	public CarForSaleRecord find(final int id) throws Exception;
	public List<CarForSaleRecord> findAll() throws Exception;
}

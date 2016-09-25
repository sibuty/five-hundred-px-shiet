package seriouscompany.debiloperspractise.fivehundredpx.ru.fivehundredpxshiet.data.entity.workunit.base;

/**
 * Created by Igor on 25.09.2016.
 */

public interface IWorkUnit {

  void registerNew();

  void registerDirty();

  void registerDelete();

  void commit();

  void rollback();
}

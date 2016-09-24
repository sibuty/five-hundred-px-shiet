package seriouscompany.debiloperspractise.fivehundredpx.ru.fivehundredpxshiet.data.entity.query.base;

import seriouscompany.debiloperspractise.fivehundredpx.ru.fivehundredpxshiet.data.entity.workunit.base.IWorkUnit;

/**
 * Created by Igor on 25.09.2016.
 */

public interface IQuery {

  void execute(final IWorkUnit workUnit);

}

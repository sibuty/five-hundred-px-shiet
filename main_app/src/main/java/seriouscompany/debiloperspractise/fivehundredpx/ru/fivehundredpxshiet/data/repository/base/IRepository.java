package seriouscompany.debiloperspractise.fivehundredpx.ru.fivehundredpxshiet.data.repository.base;

import seriouscompany.debiloperspractise.fivehundredpx.ru.fivehundredpxshiet.data.entity.query.base.IQuery;

/**
 * Created by Igor on 25.09.2016.
 */

public interface IRepository {

  void create();

  void read();

  void update();

  void delete();

  void matching(IQuery query);
}

package com.yang.myblog.service.Impl;

import com.yang.myblog.dao.PictureDao;
import com.yang.myblog.pojo.Picture;
import com.yang.myblog.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：yangyin
 * @description：照片墙业务层接口实现类
 * @date ：2021/3/16 12:57
 */
@Service
public class PictureServiceImpl implements PictureService {

    @Autowired
    private PictureDao pictureDao;


    @Override
    public List<Picture> listPicture() {
        return pictureDao.listPicture();
    }

    @Override
    public int savePicture(Picture picture) {
        return pictureDao.savePicture(picture);
    }

    @Override
    public Picture getPicture(Long id) {
        return pictureDao.getPicture(id);
    }

    @Override
    public int updatePicture(Picture picture) {
        return pictureDao.updatePicture(picture);
    }

    @Override
    public void deletePicture(Long id) {
        pictureDao.deletePicture(id);
    }
}

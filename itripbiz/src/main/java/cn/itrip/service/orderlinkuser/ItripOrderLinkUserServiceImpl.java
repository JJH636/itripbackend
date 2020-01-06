package cn.itrip.service.orderlinkuser;

import cn.itrip.dao.orderlinkuser.ItripOrderLinkUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ItripOrderLinkUserServiceImpl implements ItripOrderLinkUserService {

    @Resource
    private ItripOrderLinkUserMapper itripOrderLinkUserMapper;

    public List<Long> getItripOrderLinkUserIdsByOrder() throws Exception{
        return itripOrderLinkUserMapper.getItripOrderLinkUserIdsByOrder();
    }
}

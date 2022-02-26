/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TagLip;

import Modelo.RepuestoModel;
import java.util.List;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import static javax.servlet.jsp.tagext.Tag.SKIP_BODY;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Soporte
 */
public class Taglipindex extends TagSupport{
    
    @Override
    public int doStartTag() throws JspException {
        JspWriter escritor = pageContext.getOut();
        List<RepuestoModel> lista = (List<RepuestoModel>) pageContext.getRequest().getAttribute("lista");
        try {
            for (RepuestoModel item : lista) {
                escritor.write("<article class='col-xs-6 col-md-4 col-xl-3 product-miniature js-product-miniature swiper-slide swiper-slide-active' data-id-product='8' data-id-product-attribute='0' itemscope='' itemtype='http://schema.org/Product' style='width: 322.25px;'>"
                        + "<div class='thumbnail-container'> " +
"                                   <div class='product_image'>" +
"                                       <a href='https://ld-prestashop.template-help.com/autoworld-prestashop-theme-1-7-1/index.php?id_product=8&amp;id_product_attribute=0&amp;rewrite=air-intake-hose-for-toyota-camry-22l-4cyl-1997&amp;controller=product&amp;id_lang=1' class='thumbnail product-thumbnail'>" +
"                                           <img class='img-fluid' src='"+item.getFotoRepuesto()+"' alt='' data-full-size-image-url='https://ld-prestashop.template-help.com/autoworld-prestashop-theme-1-7-1/img/p/2/4/24-large_default.jpg'>" +
"                                       </a>" +
"                                       <ul class='product-flags hidden-xs-down'></ul>" +
"                                   </div>" +
"                                   <div class='product-heading'>" +
"                                       <h1 class='product-title' itemprop='name'>" +item.getNombreRepuesto()+"</h1>" +
"                                        <h1 class='product-title' itemprop='name'>" +item.getDescRepuesto()+"</h1>" +
"                                   </div>" +
"                                   <div class='product-description'>" +
"                                       <div class='product-price-and-shipping'>" +
"                                           <span itemprop='price' class='price'>"+"$"+item.getPrecioRepuesto()+"</span>" +
"                                       </div>" +
"                                   </div>" +
"                               </div>"+
"                        </article>"
                         );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
}

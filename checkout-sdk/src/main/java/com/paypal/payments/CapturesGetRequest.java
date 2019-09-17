// This class was generated on Wed, 11 Sep 2019 17:50:29 PDT by version 0.1.0-dev+8fcb5f of Braintree SDK Generator
// CapturesGetRequest.java
// @version 0.1.0-dev+8fcb5f
// @type request
// @data H4sIAAAAAAAC/+xb3XMbtxF/71+xc+mMoxmKdGTLSZSXKpESq00cVZLb6ageEndY8hDhgDOAI3XN+H/vLHB3vA8ytmNGbRy+kbv42q8fdgHcz9ELlmF0EiUsd4VBO16gi0bRGdrEiNwJraKT6DrVKwscHRPSwlwbYFB14JCzMkPlRhCXcHE2jkbR3ws05SUzLEOHxkYnt69G0XNkHE2H+nN0U+Y0uXVGqEU0iv7BjGCxxGpRp4VLtRH/YX4do+hvWG7hdNd7oyFjdwhX59c3cHp5AQmT0o5AqEQWHMGlCDEygwacvkMFQnnav4vHj58kiebof2FnlsCcrLmQepFgJVy6sfvXfophP1a4FJUTiR8XbJJihmO4SRGWTBYIwm4Zy5OPnkn31WmSoLWHN7T8QFy4r4ZTaTMciVmRrAdKpEDlpoI3o5w0PIuJQbd9eDL2qTGsDHZ8PIqukPEflSyjkzmTFonwuhAGeXTiTIGj6NLoHI0TaKMTVUj5ZvRWL/hGK4fKHfpmbSfoMbo+UE/s3ZXm9Mq2wVoMDL4u0DqINS97qmd5LivbTILIc20y5iqZ4Z8pmuBDjwLjEfV69JPV6tEuNPJqFH2rTdYPoEvm0vcLnypEp4J31DYMlxThkpWXTB4uUJGmkMPFmdccidkPdc9YpSJJwWmwqV7V2LAj8a+CccIgRCSSzbWyGGiN6NXStsr+y4KfDkR7LwEqQluCtVF+0ArL4bpYpgvlOstqSEOrJIUxqJISmOIQ2lXwOxeKqUQwCc4wZVlCvUZgiyQFZoFBzCRTiUeA2my8wN3Jt9XpqiVPCSY6cvY5Q3FvXWoQD5OUGZY4NHBx/ePh06PPPl8rgvq++nTCdWInQjlchLiecGEwcROD1k3qxofU2E4OwKXMgeCEuXOBNjh11ehhMMyDS0cbNWWoBc8ZVQGWiUXqIMaTgESFDCgU/klR7VO0gzlcoPHeUYlGkkpxhzD76+W/ZkEJzCAo7cCVuaBNsYS5Cb7D5LjC93rU3hzAMREZk02PzXPdvDhrzWWLmIul4MhphRpcqgvLFHep3TzdpJbw2wp8TI3jqshiNKDnzUJyyRJs8pG2h4zAIsLtNzXtG3KE93WbnYBZyzdqOLaOucJOK8jcDtuDdmvnGbCGXlRna3q+GcPDEL89Hhhktpe8NaThqgMLVmn5S6um/XZ2ef7i7OLFdzNCuNnZ+YuL87PZh4ozsNlWlDPIHE6dyHoY16FvsApz6MGcWlBCCrcXyqFR6Lo8CKnFq09T53J7Mpk4raUdC3TzsTaLSeoyOTHz5MmTJ19+YtEH5OHx+NnBGK4x0YpbH39N9KxSIbEV7GBbrXTeQYBY6uTudaEdtiPTOqPVIlBeaFcj0qRNh2DDRSGZAbzPDVpLSJEbTSBgYVEI7reluHDANVqPRgZ/wsQBkxKEWjIpuFdGAxH9Be3Cyu9g48I6nfWzpzZ1aN+62EBzWMnMAe/JwExSdQQvLXLKmgypPyGbtLoIJZzw2VdrU69S1pCgdRhjOM1zZMb6+mXN8E5k0TmJPmgM5to4O34YtXFh48JYP/U06ycBm7hDNc4Lcs1mF0lRctAKYkyZnNeQlqFJUvbhOVtPrlhriUwNBaOUS043JZZ9TlegC8WpnEALqxRdigZKXUDCVChSGeeiism6CAe2YEJZ58VkVRHaSlLhGh050Yx2nRmIuR+Rax9MtL0p72PVcO0ZqhE2z+C3xPXgXlXN6B867MM4Xy9Yt0Tp+xQ7D7VwtdQiGdRqHfJ7wk3Vt06cgoDCgjYcTQc7Yl2dYOSsRPPIdsAkFdZpE0oQaoOZzyt8cDZ9CM9QLHHXIPO9UHfQlnugOCnUXTc5qim9Wk8Bo3URehiU3uy3z09vzn88vQbfpc4PWS4mBudIySDSv0NTFZ928knKHGpmD32Pfor4bPfpU2pw3pGuImyoFXWWS3QIjpkFOnh59f0Y6pOwkEkHqclhRtQ8FgorJHWp5vVBlrBw+/LqAm4wy6nHYUhFHPK3ZiPPjj9/fOC1OQZK4HOD5JgJpQFq0T2Am/15NoLZp7OR96zZwQyaus+GE5kZyTqjZI/a32EJtb1IVq1ob/Nu6I1BNUClgiBjfdRji9ji64JaE/mBAjrotGO6hjQ03vObm8vaDE3O5rYY74EkMCh7abvcXLWT+sMCCS9cmeNbHeX4yy++aNLWpwd1tWvRLGn7s8BUDcrMmzcYulAsi8Wi0IWVJXC/lLgq6C1mTDmRNCVPcMNrKgQ9jFxVK7Tr1a1Wq7Fgivm1MWvFQvl9bEJ9D2uR+n/H9yTGwe6LDSQkn+ZGu6CZoU02NWmVhRu4Q3tJXKIkJa3bgZ4T3nHSPMe5UMghLuG2Sjqv/bhwuW5Phvmhyr96+sxZmTM5TnQ2KexkhTHLczvJ8nxiMSmMcOUkrPNwPf/Bb1+HcmHzwuGUMrGFNtSrl5cO2dt3EKqdRMjOmyw10UusD5zJ/1qb6IfuE+8YsaE63nBS8A45aW/FhLooxULE0teiEGzW8pmA8EKF3SGcPlKs/W58ZhB/9eLgyiczpFj42iC743q1PRZN03gatxoPonJLu20nNxSBdbNthzi7ixq8J8kXOKV8eChqn70Wrs8ZilO3AGoRooWjQ5MJVSF3dbBNpYVWSzQO5kZnoFXrANxpYEp7T/1VJ7e/CjOsLkyC03rCrlUHvN/hefavh5qQZG5WzZD3h1LN+5z1V7n6+p7Hh8IYzl8XYskkhrCgSCiUcDUOBN9by0VIHDJ02sDrqwBtmpPycLfp82Eay2n47Bi4WAhnwZ/KIxh/0VBN0Jywa7GjCriDs5uvxhZGWzvdcEHWY+yvyfbXZPtrso/2mmwLOih0m7ChQ94jwx4Z9sjwR0OGUDxO59j1jw55jwx7ZNgjw0eLDLlkbq5NVkV7HyBa3O7pWJ+z/cCvbhmC3jhFDoFo/UVKJvwzBzsibmz0HRq2QM+v7GWtTsLNfvNa+C2HOc/2Tw/3+LjHxz0+7gQfWYk4jZnFjenTmtdJn7ZkTu3vQNrvcGCV6uYdgOeEZzwEIPNCzoWUgVw9QLhp9xUWmLQa7pReKYKR+mnBA+CGf9HQPdUmypRxbtBufl4p/Ks9FtzXP87xfaDq8+Ev6V7m4DQ8e9q6FfduzaTUK+QQ41yb8F7w6Ph4Wys2d9XdTv8zkL8MPxaxYqHG8FyvcIlm5HuFJzIUrCxJMKcNLGP3IisykKgWLg0hoLrSkzWPjp8OLvRz5khrsERToyEFq4JCeSXxd10l4L2w7n/8PrD23f6bnS592+uj6t3MxVkNtxQBkDF7h5wUZMO1rLdC1YMlid+GKzgKL7KqC8fCYvN+w3Cfogis1N7vZ8GgnyGWJaBKTOkN6zd6yI3OjUDHTAlLElj5U+GvmcUnR9S3qF4woiKjVEBpC7mrc+J3qPhaV2kbkppN3H1+s89v9vnNR5bfvNrpkwjyj+rzgt/ouv0dHbrI+cZvC7r0/bcF/7/fFrx6M6o/Tq1s3f6m9Kfw8ctz5/IfwovAk+i785sofOIZnUST5dGkflE9qd+ET35ef875JhpF13cib1Zwfp9j4pBfe/+lkIxOjh4/fvOn/wIAAP//
// DO NOT EDIT
package com.paypal.payments;

import com.braintreepayments.http.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
/**
 * Shows details for a captured payment, by ID.
 */
public class CapturesGetRequest extends HttpRequest<Capture> {

    public CapturesGetRequest(String captureId) {
        super("/v2/payments/captures/{capture_id}?", "GET", Capture.class);
        try {
            path(path().replace("{capture_id}", URLEncoder.encode(String.valueOf(captureId), "UTF-8")));
        } catch (UnsupportedEncodingException ignored) {}
        
        header("Content-Type", "application/json");
    }
    public CapturesGetRequest authorization(String authorization) {
        header("Authorization", String.valueOf(authorization));
        return this;
    }
    
    public CapturesGetRequest contentType(String contentType) {
        header("Content-Type", String.valueOf(contentType));
        return this;
    }
    
    
}

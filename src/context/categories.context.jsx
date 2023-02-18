
import { createContext, useState } from "react"
import { SHOP_DATA } from "../shop-data"

export const CategoriesContext = createContext({
    categories: [],
    setCategories: () => []

});

export const CategoriesProvider = ({children}) => {
    const [categories] = useState(SHOP_DATA);
    const value = {categories};
    return (
        <CategoriesContext.Provider value={value} >{children}</CategoriesContext.Provider>
    )
}